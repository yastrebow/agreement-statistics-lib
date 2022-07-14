package ru.yastrebov.agreementStatisticsLib.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.yastrebov.agreementStatisticsLib.model.enums.Status;

import java.time.ZonedDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgreementStatistics {

    Long id;

    ZonedDateTime date;

    Status status;
}
