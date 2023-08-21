package test.streamTest.test;

import test.entity.SgxkInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {

    public static void main(String[] args) {

        List<SgxkInfo> sgxkInfos = new ArrayList<>();
        sgxkInfos.add(new SgxkInfo(null,"111"));
        sgxkInfos.add(new SgxkInfo("11","111"));
        sgxkInfos.add(new SgxkInfo("11","222"));
        sgxkInfos.add(new SgxkInfo("21","222"));
        sgxkInfos.add(new SgxkInfo("31","111"));

        sgxkInfos = sgxkInfos.stream()
                .filter(a -> a.getFlowState()!=null)
                .filter(a -> a.getDwType().equals("111"))
                .collect(Collectors.toList());

        for (SgxkInfo x : sgxkInfos)
            System.out.println(x);

    }

}
