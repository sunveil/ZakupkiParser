package ru.homyakin.zakupki.service.parser;

import ru.homyakin.zakupki.models._223fz.purchaseplan.PurchasePlan;

import java.util.Optional;

public class PurchasePlanParser extends MainXmlParser  {
    public static Optional<PurchasePlan> parse(String filePath) {
        return parse(filePath, PurchasePlan.class);
    }
}
