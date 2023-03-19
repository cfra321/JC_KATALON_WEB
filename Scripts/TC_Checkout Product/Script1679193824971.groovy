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

WebUI.navigateToUrl('https://shop.demoqa.com/product/black-cross-back-maxi-dress/')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionBeigeBlack'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/select_Choose an optionLargeMediumSmall'), 
    'medium', true)

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Black Cross Back Maxi Dress  ToolsQA D_c31fe6/a_View cart'))

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 
    'kukuh')

WebUI.setText(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 
    'cfra')

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/span_India'))

WebUI.setText(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 
    'home')

WebUI.setText(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 
    'delhi')

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/span_Delhi'))

WebUI.setText(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), 
    '325131')

WebUI.setText(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), 
    '021586786')

WebUI.setText(findTestObject('Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'sret@gmail.com')

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.click(findTestObject('Object Repository/CHECKOUT PRODUCT/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'))

WebUI.closeBrowser()

