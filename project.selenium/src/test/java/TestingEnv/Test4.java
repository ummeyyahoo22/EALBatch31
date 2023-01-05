package TestingEnv;

import org.testng.annotations.Test;

public class Test4 {
  @Test(groups = {"smoke","Friday tests"})
  public void testcase1() {
	  System.out.println("This is TC1 logic");
  }
  @Test(groups = {"smoke","sanity"})
  public void testcase2() {
	  System.out.println("This is TC2 logic");
  }
  @Test(groups = {"smoke","sanity","regression"})
  public void testcase3() {
	  System.out.println("This is TC3 logic");
  }
  @Test(groups = {"sanity"})
  public void testcase4() {
	  System.out.println("This is TC4 logic");
  }
  @Test(groups = {"regression"})
  public void testcase5() {
	  System.out.println("This is TC5 logic");
  }
  @Test(groups = {"smoke","regression"})
  public void testcase6() {
	  System.out.println("This is TC6 logic");
  }
  
}
