
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
@Autonomous
public class spinnerTestCopy extends LinearOpMode {
    DcMotor CarouselWheel;
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        CarouselWheel.setPower(0.7);
        sleep(1100);
        CarouselWheel.setPower(1);
        sleep(400);

    }
}
