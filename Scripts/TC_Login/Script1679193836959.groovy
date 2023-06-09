import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LOGIN/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/LOGIN/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Object Repository/LOGIN/Page_My Account  ToolsQA Demo Site/input__username'), 'kukuh')

WebUI.setEncryptedText(findTestObject('Object Repository/LOGIN/Page_My Account  ToolsQA Demo Site/input__password'), '8a3Ij51V+s4G/W+CEjz1Iw==')

WebUI.click(findTestObject('Object Repository/LOGIN/Page_My Account  ToolsQA Demo Site/input__rememberme'))

WebUI.click(findTestObject('Object Repository/LOGIN/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/LOGIN/Page_My Account  ToolsQA Demo Site/p_Hello kukuh (not kukuh Log out)'))

WebUI.closeBrowser()

