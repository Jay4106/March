package com.cucumber.maven_cucumber;


/**
 * Hello world!
 *
 */
public class App 
{

@RunWith(cucumber.class)
@Cucumber.Options{
	format = {"pretty", "json:target/"},
	features = {"src/cucumber1"}
}


