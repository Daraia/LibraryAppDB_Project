package com.library.steps;

import com.library.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UserTableColumns_StepDefinitions {

    @When("Execute query to get all columns")
    public void execute_query_to_get_all_columns() {
        DB_Util.runQuery("select * from users");
    }

    @Then("verify the below columns are listed in result")
    public void verify_the_below_columns_are_listed_in_result(List<String> expectedColumnNames) {

        List<String> actualColumnNames = DB_Util.getAllColumnNamesAsList();

        Assert.assertEquals(expectedColumnNames,actualColumnNames);

    }

}
