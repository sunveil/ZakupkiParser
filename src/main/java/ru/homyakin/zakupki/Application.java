package ru.homyakin.zakupki;

import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.homyakin.zakupki.web.FTPClient223fz;
import ru.homyakin.zakupki.web.exceptions.NetworkException;

@SpringBootApplication
@EnableScheduling
public class Application implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    private final FTPClient223fz ftp;

    public Application(FTPClient223fz ftp) {
        this.ftp = ftp;
    }

    @Override
    public void run(String... args) {
        try {
            ftp.connect();
            ftp.login();
            selectRegions();
            selectFolders();
            ftp.parseFTPServer();
        } catch (NetworkException e) {
            logger.error("Network error: {}", e.getMessage(), e);
        } catch (Exception e) {
            logger.error("Internal error", e);
        }
    }

    private void selectFolders() {
        var folders = ftp.getAllParsingFolders();
        System.out.println("0: Start");
        for (int i = 0; i < folders.length; ++i) {
            System.out.println(i + 1 + ": " + folders[i].getValue());
        }
        int folder = -1;
        Scanner sc = new Scanner(System.in);
        while (folder != 0) {
            folder = sc.nextInt();
            if (folder < 1 || folder > folders.length) {
                continue;
            }
            ftp.addParsingFolder(folders[folder - 1]);
        }
    }

    private void selectRegions() {
        var regions = ftp.getAllRegions();
        System.out.println("0: Start");
        for (int i = 0; i < regions.size(); ++i) {
            System.out.println(i + 1 + ": " + regions.get(i));
        }
        int folder = -1;
        Scanner sc = new Scanner(System.in);
        while (folder != 0) {
            folder = sc.nextInt();
            if (folder < 1 || folder > regions.size()) {
                continue;
            }
            ftp.addParsingRegion(regions.get(folder - 1));
        }
    }

    //TODO add reconnecting to server if something went wrong
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
