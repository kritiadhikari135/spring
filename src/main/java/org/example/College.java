package org.example;

public class College {
    private Principal principal;
    public College(Principal principal){
        this.principal = principal;
    }

    public void test(){
        principal.info();
        System.out.println("This is college class");
    }
}
