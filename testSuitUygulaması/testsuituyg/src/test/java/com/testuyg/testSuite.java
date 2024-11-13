package com.testuyg;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({hesapMakinesi.class, stringIslem.class})
@IncludeTags("hızlı")
@ExcludeTags("yavaş")

public class testSuite {

}
