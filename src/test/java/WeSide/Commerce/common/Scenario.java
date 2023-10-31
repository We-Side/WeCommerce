package WeSide.Commerce.common;

import WeSide.Commerce.account.api.AccountApi;

public class Scenario {

    public static AccountApi accountApi() {
        return new AccountApi();
    }

}
