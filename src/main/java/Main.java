import package1.ProjectOfferCode;

import static package1.ProjectOfferCode.of;

public class Main {

    public void testProjectOfferCode(String codeValue) {
        ProjectOfferCode code = of(codeValue);
//        ProjectOfferCode code = ProjectOfferCode.of(codeValue);
        code.getCode();
    }

}
