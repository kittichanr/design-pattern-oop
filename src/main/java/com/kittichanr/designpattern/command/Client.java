package com.kittichanr.designpattern.command;

import com.kittichanr.designpattern.command.concrete_command.*;
import com.kittichanr.designpattern.command.invoker.RemoteControl;
import com.kittichanr.designpattern.command.receiver.CeilingFan;
import com.kittichanr.designpattern.command.receiver.GarageDoor;
import com.kittichanr.designpattern.command.receiver.Light;
import com.kittichanr.designpattern.command.receiver.Stereo;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();


        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Light KitchenLight = new Light("Kitchen");
        LightOnCommand KitchenLightOn = new LightOnCommand(KitchenLight);
        LightOffCommand KitchenLightOnOff = new LightOffCommand(KitchenLight);

        GarageDoor garageDoor = new GarageDoor("Garage");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOffCommand garageOffOpenCommand = new GarageDoorOffCommand(garageDoor);

        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, KitchenLightOn, KitchenLightOnOff);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageOffOpenCommand);
        remoteControl.setCommand(3, stereoWithCD, stereoOff);
        remoteControl.setCommand(4, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(5, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(6, ceilingFanHigh, ceilingFanOff);


//        -------- Demo Execute Case ----------s
//        System.out.println(remoteControl);
//        remoteControl.onButtonWasPressed(0);
//        remoteControl.offButtonWasPressed(0);
//        remoteControl.onButtonWasPressed(1);
//        remoteControl.offButtonWasPressed(1);
//        remoteControl.onButtonWasPressed(2);
//        remoteControl.offButtonWasPressed(2);
//        remoteControl.onButtonWasPressed(3);
//        remoteControl.offButtonWasPressed(3);
//        remoteControl.onButtonWasPressed(4);
//        remoteControl.offButtonWasPressed(4);

//        remoteControl.onButtonWasPressed(0);
//        remoteControl.offButtonWasPressed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPressed(0);
//        remoteControl.onButtonWasPressed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

//        ------ Demo Undo Case ------
//        remoteControl.onButtonWasPressed(5);
//        remoteControl.offButtonWasPressed(5);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPressed(6);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
    }

    public static class MacroCommandCase {
        public static void main(String[] args) {
//  ----- Group Command Case -----
            RemoteControl remoteControl = new RemoteControl();

            Light light = new Light("Living Room");
            Stereo stereo = new Stereo("Living Room");
            GarageDoor garageDoor = new GarageDoor("Garage");


            LightOnCommand lightOn = new LightOnCommand(light);
            StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
            GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

            LightOffCommand lightOff = new LightOffCommand(light);
            StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
            GarageDoorOffCommand garageDoorOff = new GarageDoorOffCommand(garageDoor);

            Command[] partyOn = {lightOn, stereoOnWithCD, garageDoorOpen};
            Command[] partyOff = {lightOff, stereoOffWithCD, garageDoorOff};

            MacroCommand partyOnMacro = new MacroCommand(partyOn);
            MacroCommand partyOffMacro = new MacroCommand(partyOff);

            remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

            System.out.println(remoteControl);
            System.out.println("---------- Pushing Macro On --------");
            remoteControl.onButtonWasPressed(0);
            System.out.println("---------- Pushing Macro Off --------");
            remoteControl.offButtonWasPressed(0);
            System.out.println("---------- Pushing Macro undo --------");
            remoteControl.undoButtonWasPushed();
        }
    }

}
