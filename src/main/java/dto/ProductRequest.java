package dto;

import java.math.BigDecimal;


public record ProductRequest(String Id, String Name, String Description, BigDecimal price) {

}
