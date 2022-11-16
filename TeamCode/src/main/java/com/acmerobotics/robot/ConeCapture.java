package com.acmerobotics.robot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ConeCapture {

    public HardwareMap hMap;
    private Servo servo;

    private static double held = 0.35;
    private static double lift = 0.65;

    public ConeCapture(HardwareMap hardwareMap) {
        hMap = hardwareMap;
        servo = hardwareMap.servo.get("captureServo");
    }
    public void moveToCapture() {
        servo.setPosition(held);
    }

    public void moveToRelease() {
        servo.setPosition(lift);
    }
}