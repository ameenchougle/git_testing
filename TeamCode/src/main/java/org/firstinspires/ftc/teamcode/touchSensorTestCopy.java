package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

@Autonomous
public class touchSensorTestCopy extends LinearOpMode {

    TouchSensor touch;
    public Servo servo;
    @Override
    public void runOpMode() throws InterruptedException {
        //touch = hardwareMap.get(TouchSensor.class, "Touch");
        servo = hardwareMap.get(Servo.class, "servo");
        touch = hardwareMap.get(TouchSensor.class, "Touch");
        waitForStart();
        //revert test two
        while (opModeIsActive()) {
         if(touch.isPressed()) {
             servo.setPosition(0);
         } else {
             servo.setPosition(1);
         }
    }}}
