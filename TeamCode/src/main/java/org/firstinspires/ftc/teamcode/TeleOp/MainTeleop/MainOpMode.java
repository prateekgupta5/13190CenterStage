package org.firstinspires.ftc.teamcode.TeleOp.MainTeleop;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.TeleOp.MainTeleop.BaseOpMode;

@TeleOp(name = "MainTeleop")
public class MainOpMode extends BaseOpMode {


    @Override
    public void initialize() {
        super.initialize();

        register(driveSubsystem);

        gb1(GamepadKeys.Button.X).toggleWhenPressed(driveRobotCentricSlowModeCommand);

        gb2(GamepadKeys.Button.A).toggleWhenPressed(startIntakeCommand);
        gb2(GamepadKeys.Button.LEFT_BUMPER).toggleWhenPressed(clawGrabCommand, clawReleaseCommand);

        driveSubsystem.setDefaultCommand(driveRobotCentricCommand);

    }

    public void run()
    {
        super.run();
    }
}