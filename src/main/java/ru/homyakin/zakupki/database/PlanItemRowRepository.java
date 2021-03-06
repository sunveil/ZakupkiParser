package ru.homyakin.zakupki.database;

import java.util.List;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.homyakin.zakupki.models._223fz.purchaseplan.InnovationPlanDataItemRowType;
import ru.homyakin.zakupki.models._223fz.purchaseplan.PurchasePlanDataItemRowType;

@Component
public class PlanItemRowRepository {
    private static final Logger logger = LoggerFactory.getLogger(PlanItemRowRepository.class);
    private final JdbcTemplate jdbcTemplate;
    private final RepositoryService repositoryService;

    public PlanItemRowRepository(
        DataSource dataSource,
        RepositoryService repositoryService
    ) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        this.repositoryService = repositoryService;
    }

    public void insert(PurchasePlanDataItemRowType purchasePlanItemRow, String planItemGuid) {
        String sql = "INSERT INTO zakupki.purchase_plan_item_row (plan_item_guid, ordinal_number, additional_info," +
            "okdp_code, okdp_name, okpd2_code, okpd2_name, okved_code, okved_name, okved2_code, okved2_name, okato," +
            " region, impossible_to_determine_attr, okei_code, okei_name, qty)" +
            "VALUES" +
            "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        var okdp = repositoryService.getClassifier(purchasePlanItemRow.getOkdp());
        var okpd2 = repositoryService.getClassifier(purchasePlanItemRow.getOkpd2());
        var okved = repositoryService.getClassifier(purchasePlanItemRow.getOkved());
        var okved2 = repositoryService.getClassifier(purchasePlanItemRow.getOkved2());
        var okei = repositoryService.getClassifier(purchasePlanItemRow.getOkei());
        try {
            jdbcTemplate.update(
                sql,
                planItemGuid,
                purchasePlanItemRow.getOrdinalNumber(),
                repositoryService.removeExtraSpaces(purchasePlanItemRow.getAdditionalInfo()),
                repositoryService.getClassifierCode(okdp),
                repositoryService.getClassifierName(okdp),
                repositoryService.getClassifierCode(okpd2),
                repositoryService.getClassifierName(okpd2),
                repositoryService.getClassifierCode(okved),
                repositoryService.getClassifierName(okved),
                repositoryService.getClassifierCode(okved2),
                repositoryService.getClassifierName(okved2),
                repositoryService.getOkatoCode(purchasePlanItemRow.getOkato()),
                repositoryService.removeExtraSpaces(purchasePlanItemRow.getRegion()),
                repositoryService.convertBoolean(purchasePlanItemRow.isImpossibleToDetermineAttr()),
                repositoryService.getClassifierCode(okei),
                repositoryService.getClassifierName(okei),
                purchasePlanItemRow.getQty()
            );
        } catch (Exception e) {
            logger.error("Internal database error", e);
        }
    }

    public void insert(InnovationPlanDataItemRowType innovationPlanItemRow, String planItemGuid) {
        String sql = "INSERT INTO zakupki.innovation_plan_item_row (plan_item_guid, ordinal_number, additional_info," +
            "okdp_code, okdp_name, okpd2_code, okpd2_name, okved_code, okved_name, okved2_code, okved2_name)" +
            "VALUES" +
            "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        var okdp = repositoryService.getClassifier(innovationPlanItemRow.getOkdp());
        var okpd2 = repositoryService.getClassifier(innovationPlanItemRow.getOkpd2());
        var okved = repositoryService.getClassifier(innovationPlanItemRow.getOkved());
        var okved2 = repositoryService.getClassifier(innovationPlanItemRow.getOkved2());
        jdbcTemplate.update(
            sql,
            planItemGuid,
            innovationPlanItemRow.getOrdinalNumber(),
            repositoryService.removeExtraSpaces(innovationPlanItemRow.getAdditionalInfo()),
            repositoryService.getClassifierCode(okdp),
            repositoryService.getClassifierName(okdp),
            repositoryService.getClassifierCode(okpd2),
            repositoryService.getClassifierName(okpd2),
            repositoryService.getClassifierCode(okved),
            repositoryService.getClassifierName(okved),
            repositoryService.getClassifierCode(okved2),
            repositoryService.getClassifierName(okved2)
        );
    }

    public void update(PurchasePlanDataItemRowType purchasePlanItemRow, String planItemGuid) {
        if (!checkPlanItemRow(planItemGuid, purchasePlanItemRow.getOrdinalNumber(), "purchase_plan_item_row")) {
            insert(purchasePlanItemRow, planItemGuid);
            return;
        }
        try {
            String sql = "UPDATE purchase_plan_item_row SET additional_info = ?, okdp_code = ?, okdp_name = ?, " +
                "okpd2_code = ?, okpd2_name = ?, okved_code = ?, okved_name = ?, okved2_code = ?, okved2_name = ?, " +
                "okato = ?, region = ?, impossible_to_determine_attr = ?, okei_code = ?, okei_name = ?, qty = ? " +
                "WHERE plan_item_guid = ? and ordinal_number = ?";
            var okdp = repositoryService.getClassifier(purchasePlanItemRow.getOkdp());
            var okpd2 = repositoryService.getClassifier(purchasePlanItemRow.getOkpd2());
            var okved = repositoryService.getClassifier(purchasePlanItemRow.getOkved());
            var okved2 = repositoryService.getClassifier(purchasePlanItemRow.getOkved2());
            var okei = repositoryService.getClassifier(purchasePlanItemRow.getOkei());
            jdbcTemplate.update(
                sql,
                repositoryService.removeExtraSpaces(purchasePlanItemRow.getAdditionalInfo()),
                repositoryService.getClassifierCode(okdp),
                repositoryService.getClassifierName(okdp),
                repositoryService.getClassifierCode(okpd2),
                repositoryService.getClassifierName(okpd2),
                repositoryService.getClassifierCode(okved),
                repositoryService.getClassifierName(okved),
                repositoryService.getClassifierCode(okved2),
                repositoryService.getClassifierName(okved2),
                repositoryService.getOkatoCode(purchasePlanItemRow.getOkato()),
                repositoryService.removeExtraSpaces(purchasePlanItemRow.getRegion()),
                repositoryService.convertBoolean(purchasePlanItemRow.isImpossibleToDetermineAttr()),
                repositoryService.getClassifierCode(okei),
                repositoryService.getClassifierName(okei),
                purchasePlanItemRow.getQty(),
                planItemGuid,
                purchasePlanItemRow.getOrdinalNumber()
            );
        } catch (Exception e) {
            logger.error("Internal database error", e);
        }
    }

    public void update(InnovationPlanDataItemRowType innovationPlanItemRow, String planItemGuid) {
        if (!checkPlanItemRow(planItemGuid, innovationPlanItemRow.getOrdinalNumber(), "innovation_plan_item_row")) {
            insert(innovationPlanItemRow, planItemGuid);
            return;
        }
        try {
            String sql = "UPDATE innovation_plan_item_row SET additional_info = ?, okdp_code = ?, okdp_name = ?, " +
                "okpd2_code = ?, okpd2_name = ?, okved_code = ?, okved_name = ?, okved2_code = ?, okved2_name = ? " +
                "WHERE plan_item_guid = ? and ordinal_number = ?";
            var okdp = repositoryService.getClassifier(innovationPlanItemRow.getOkdp());
            var okpd2 = repositoryService.getClassifier(innovationPlanItemRow.getOkpd2());
            var okved = repositoryService.getClassifier(innovationPlanItemRow.getOkved());
            var okved2 = repositoryService.getClassifier(innovationPlanItemRow.getOkved2());
            jdbcTemplate.update(
                sql,
                innovationPlanItemRow.getAdditionalInfo(),
                repositoryService.getClassifierCode(okdp),
                repositoryService.getClassifierName(okdp),
                repositoryService.getClassifierCode(okpd2),
                repositoryService.getClassifierName(okpd2),
                repositoryService.getClassifierCode(okved),
                repositoryService.getClassifierName(okved),
                repositoryService.getClassifierCode(okved2),
                repositoryService.getClassifierName(okved2),
                planItemGuid,
                innovationPlanItemRow.getOrdinalNumber()
            );
        } catch (Exception e) {
            logger.error("Internal database error", e);
        }
    }

    private boolean checkPlanItemRow(String guid, Integer ordinalNumber, String table) {
        String sql = "SELECT plan_item_guid FROM " + table + " WHERE plan_item_guid = ? and ordinal_number = ?";
        List<String> result = jdbcTemplate.query(
            sql,
            new Object[]{guid, ordinalNumber},
            (rs, rowNum) -> rs.getString("plan_item_guid")
        );
        return result.size() != 0;
    }
}
