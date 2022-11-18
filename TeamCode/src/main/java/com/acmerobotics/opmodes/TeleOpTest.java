package com.acmerobotics.opmodes;

import com.acmerobotics.robot.ConeCapture;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class TeleOpTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        ConeCapture coneCapture = new ConeCapture(hardwareMap);
        waitForStart();

        while (opModeIsActive()) {
            boolean captureServo = gamepad1.x;
            boolean releaseServo = gamepad1.y;


            if (captureServo == true) {
                coneCapture.moveToCapture();
            }
            if (releaseServo == true) {
                coneCapture.moveToRelease();
            }

            telemetry.addData("x pressed",captureServo);
            telemetry.addData("y pressed",releaseServo);
            telemetry.update();
        }
    }
}