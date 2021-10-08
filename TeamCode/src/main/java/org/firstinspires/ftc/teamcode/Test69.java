package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.configuration.typecontainers.ServoConfigurationType;

@TeleOp(name = "Maneta") // Pt controller

public class Test69 extends OpMode
{

    Servo Maneta;

    @Override
    public void init()
    {
        Maneta = (Servo) hardwareMap.get("rampa");
    }

    @Override
    public void loop()
    {
        if(gamepad2.x)
        {
            Maneta.setPosition(-0.3); // Pt servo
        }
        else
        {
            Maneta.setPosition(0);
        }
    }
}
