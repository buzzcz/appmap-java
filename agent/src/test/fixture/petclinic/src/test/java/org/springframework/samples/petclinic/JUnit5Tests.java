package org.springframework.samples.petclinic;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.appland.appmap.annotation.NoAppMap;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class JUnit5Tests {
  @Test
  public void testItPasses() {
    System.err.println("passing test");
    
    assertTrue(true);
  }

  @Test
  public void testItFails() {
    System.err.println("failing test");

    assertTrue(false);
  }

  @NoAppMap
  @Test
  public void testAnnotatedMethodNotRecorded() {
    System.err.println("passing annotated test, not recorded");

    assertTrue(true);
  }

  @Nested
  @NoAppMap
  class TestClass {
    @Test
    public void testAnnotatedClassNotRecorded() {
      System.err.println("passing annotated class, not recorded");

      assertTrue(true);
    }
  }

}