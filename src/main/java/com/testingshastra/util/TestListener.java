package com.testingshastra.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testingshastra.Keywords.UIKeywords;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestListener implements ITestListener {
	private static final Logger LOG = Logger.getLogger(TestListener.class);

	@Override
	public void onTestFailure(ITestResult result) {

		AShot ashot = new AShot();
		LOG.info("Test is Fsiled. Taking ScreenShot");
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(200));
		Screenshot sc = ashot.takeScreenshot(UIKeywords.getInstance().driver);
		BufferedImage img = sc.getImage();
		String dir = System.getProperty("user.dir");
		try {
			ImageIO.write(img, "png", new File(dir + "/ScreenShots/" + result.getName() + ".png"));
			LOG.info("screenshot is saved successfully");

		} catch (IOException e) {
			LOG.error("Ubable To take ScreenShot");
			e.printStackTrace();

		}

	}

}
