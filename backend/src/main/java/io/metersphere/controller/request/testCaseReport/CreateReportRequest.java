package io.metersphere.controller.request.testCaseReport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateReportRequest {
    String planId;
    String templateId;
}
