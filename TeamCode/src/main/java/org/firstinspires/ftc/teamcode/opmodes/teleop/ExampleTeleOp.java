package org.firstinspires.ftc.teamcode.opmodes.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name = "Example TeleOp", group = "Tests")
public class ExampleTeleOp extends OpMode {

    private Robot robot;

    public ExampleTeleOp() {
        robot = Robot.getInstance();
    }

    @Override
    public void init() {
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {

        // Read Values From Gamepad
        double drive  = gamepad1.left_stick_y;
        double strafe = gamepad1.left_stick_x;
        double twist  = gamepad1.right_stick_x;

        // Vector The Robot With The Driver Input
        robot.drivetrain.vector(drive, strafe, twist);

    }
}