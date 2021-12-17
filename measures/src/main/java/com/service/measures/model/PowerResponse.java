/*
 * Measures Service
 * Micro service to get temperature and power measures in building
 *
 * OpenAPI spec version: 1.0.0
 * Contact: supportm@measures.pl
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.service.measures.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PowerResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-12-17T10:43:35.462286600+01:00[Europe/Warsaw]")
public class PowerResponse {
  @JsonProperty("measuresId")
  private String measuresId = null;

  @JsonProperty("dates")
  private List<OffsetDateTime> dates = null;

  @JsonProperty("powers")
  private List<BigDecimal> powers = null;

  public PowerResponse measuresId(String measuresId) {
    this.measuresId = measuresId;
    return this;
  }

  /**
   * Get measuresId
   * @return measuresId
   **/
  public String getMeasuresId() {
    return measuresId;
  }

  public void setMeasuresId(String measuresId) {
    this.measuresId = measuresId;
  }

  public PowerResponse dates(List<OffsetDateTime> dates) {
    this.dates = dates;
    return this;
  }

  public PowerResponse addDatesItem(OffsetDateTime datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  public List<OffsetDateTime> getDates() {
    return dates;
  }

  public void setDates(List<OffsetDateTime> dates) {
    this.dates = dates;
  }

  public PowerResponse powers(List<BigDecimal> powers) {
    this.powers = powers;
    return this;
  }

  public PowerResponse addPowersItem(BigDecimal powersItem) {
    if (this.powers == null) {
      this.powers = new ArrayList<>();
    }
    this.powers.add(powersItem);
    return this;
  }

   /**
   * Get powers
   * @return powers
  **/
  public List<BigDecimal> getPowers() {
    return powers;
  }

  public void setPowers(List<BigDecimal> powers) {
    this.powers = powers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerResponse powerResponse = (PowerResponse) o;
    return Objects.equals(this.dates, powerResponse.dates) &&
        Objects.equals(this.powers, powerResponse.powers) &&
            Objects.equals(this.measuresId, powerResponse.measuresId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates, powers, measuresId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerResponse {\n");
    sb.append("    measuresId: ").append(toIndentedString(measuresId)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    powers: ").append(toIndentedString(powers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}