package org.acme.openapi.validate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Order {
    public String title;

    @NotBlank(message="Author may not be blank")
    public String author;

    @Min(message="Author has been very lazy", value=1)
    public double pages;
}
