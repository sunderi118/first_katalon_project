import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.yahoo.co.jp/config/login')

WebUI.setEncryptedText(findTestObject('Page_ - Yahoo JAPAN/input__passwd'), '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('Page_ - Yahoo JAPAN/input_ID_login'), 'underi522')

WebUI.setEncryptedText(findTestObject('Page_ - Yahoo JAPAN/input__passwd'), 'vXdGQs0Qu+/7GSo70OiBZg==')

WebUI.click(findTestObject('Page_Yahoo JAPAN/a_'))

WebUI.setText(findTestObject('Page_ - /input__p'), 'ランドクルーザー')

WebUI.click(findTestObject('Page_ - /input__acHdSchBtn'))

WebUI.click(findTestObject('Object Repository/Page_ -/a_4'))

