/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv5macrocommand;

/**
 *
 * @author moronkreacionz
 */
public class DPCommandPatternRemoteControlv5MacroCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl("E1120-Rock-Remote");

        Light livingRoomLight = new Light("LivingRoom");
        Light kitchenLight = new Light("KitchenRoom");
        CeilingFan livingRoomCeilingFan = new CeilingFan("LivingRoom CeilingFan");
        GarageDoor mainGarageDoor = new GarageDoor("Garage Main Door");
        Stereo stereo = new Stereo("LivingRoom Stereo");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanMedCommand livingRoomCeilingFanMedCommand = new CeilingFanMedCommand(livingRoomCeilingFan);
        CeilingFanHighCommand livingRoomCeilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(mainGarageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(mainGarageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //allLightsOnCommand allLightsOffCommand
        //partyModeOnCommand partyModeOffCommand 
        System.out.println("\n---------------- Slot 0: Living Room Light --------------------------------\n");
        int slot = 0;
        // 0, livingRoomLight 
        rc.setCommand(slot, livingRoomLightOnCommand, livingRoomLightOffCommand);
        System.out.println("-- Setting Living Room Light On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Living Room Light Off >> ");
        rc.offCommandPressed(slot);

        slot++;
        System.out.println("\n---------------- Slot 1: Kitchen Light --------------------------------\n");
        // 1, kitchenLight 
        rc.setCommand(slot, kitchenLightOnCommand, kitchenLightOffCommand);
        System.out.println("-- Setting Kitchen Room Light On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Kitchen Room Light Off >> ");
        rc.offCommandPressed(slot);

        slot++;
        System.out.println("\n---------------- Slot 2: LivingRoom CeilingFan --------------------------------\n");
        // 2, livingRoomCeilingFan
        rc.setCommand(slot, livingRoomCeilingFanHighCommand, livingRoomCeilingFanOffCommand);
        System.out.println("-- Setting Living Room Ceiling Fan On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Living Room Ceiling Fan Off >> ");
        rc.offCommandPressed(slot);

        slot++;
        System.out.println("\n---------------- Slot 3: Main Garage Door--------------------------------\n");
        // 3, garageDoor
        rc.setCommand(slot, garageDoorOpenCommand, garageDoorCloseCommand);
        System.out.println("-- Setting Main Room Garage Open >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Main Room Garage Close >> ");
        rc.offCommandPressed(slot);

        slot++;
        System.out.println("\n---------------- Slot 4: Stereo --------------------------------\n");
        // 4, stereo
        rc.setCommand(slot, stereoOnCommand, stereoOffCommand);
        System.out.println("-- Setting Stereo On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Stereo Off >> ");
        rc.offCommandPressed(slot);

        slot++; // 5, allLights
        System.out.println("\n---------------- Slot 5: All Lights --------------------------------\n");
        //  rc.setCommand(slot, allLightsOnCommand, allLightsOffCommand);

        slot++; // 6, partyMode
        System.out.println("\n---------------- Slot 6: Party Mode--------------------------------\n");
        System.out.println("\n---------------- Review Macro Commands starts--------------------------------\n");
        TV livingRoomTV = new TV("LivingRoom TV");
        HotTub mainHotTub = new HotTub("Main HotTub");
        
        TVOnCommand tvOnCommand = new TVOnCommand(livingRoomTV);
        TVOffCommand tvOffCommand = new TVOffCommand(livingRoomTV);

        HotTubOnCommand mainHotTubOnCommand = new HotTubOnCommand(mainHotTub);
        HotTubOffCommand mainHotTubOffCommand = new HotTubOffCommand(mainHotTub);

        Command[] partyOn = {livingRoomLightOnCommand,
                            livingRoomCeilingFanHighCommand,
                            tvOnCommand,
                            stereoOnCommand,
                            mainHotTubOnCommand
                            };
        Command[] partyOff = {livingRoomLightOffCommand,
                            livingRoomCeilingFanOffCommand,
                            tvOffCommand,
                            stereoOffCommand,
                            mainHotTubOffCommand
                            };

        MacroCommand partyModeOnMacro = new MacroCommand(partyOn);
        MacroCommand partyModeOffMacro = new MacroCommand(partyOff);
        
        System.out.println("\n---------------- Printing partyModeOnMacro --------------------------------\n");
        System.out.println(partyModeOnMacro);
        System.out.println("\n---------------- Printing partyModeOffMacro --------------------------------\n");
        System.out.println(partyModeOffMacro);
        
        rc.setCommand(slot, partyModeOnMacro, partyModeOffMacro);
        System.out.println("\n---------------- RC On Command Pressed--------------------------------\n");
        rc.onCommandPressed(slot);
        System.out.println("\n---------------- RC Off Command Pressed --------------------------------\n");
        rc.offCommandPressed(slot);

        System.out.println("\n---------------- Review Macro Commands ends--------------------------------\n");

        slot++; // 7, livingRoomCeilingFan
        System.out.println("\n---------------- Slot 7: LivingRoom Fan testing again--------------------------------\n");
        rc.setCommand(slot, livingRoomCeilingFanMedCommand, livingRoomCeilingFanOffCommand);

        System.out.println("-- Setting livingRoomCeilingFanMedCommand On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting livingRoomCeilingFanMedCommand Off >> ");
        rc.offCommandPressed(slot);

        System.out.println("\n---------------- Remote Control Info --------------------------------\n");
        System.out.println(rc);

        System.out.println("\n\n\n---------------- Simple Remote Control --------------------------------\n");

        SimpleRemoteControl rc1 = new SimpleRemoteControl();
        System.out.println("--");

        Light livingRoomLight1 = new Light("LivingRoomLight");
        System.out.println("--");

        LightOnCommand livingRoomOnCommand1 = new LightOnCommand(livingRoomLight1);
        System.out.println("-- Setting Light On >> ");

        rc1.setCommand(livingRoomOnCommand1);
        rc1.buttonWasPressed();

        System.out.println("-- Setting Light Off >> ");
        LightOffCommand livingRoomOffCommand1 = new LightOffCommand(livingRoomLight1);

        rc1.setCommand(livingRoomOffCommand1);
        rc1.buttonWasPressed();

        System.out.println("--");
        System.out.println("-- Setting GarageDoor Open >> ");
        GarageDoor mainGarageDoor1 = new GarageDoor("Main Garage Door");
        GarageDoorOpenCommand garageDoorOpenCommand1 = new GarageDoorOpenCommand(mainGarageDoor1);

        rc1.setCommand(garageDoorOpenCommand1);
        rc1.buttonWasPressed();

        System.out.println("-- Setting GarageDoor Close >> ");
        GarageDoorCloseCommand garageDoorCloseCommand1 = new GarageDoorCloseCommand(mainGarageDoor1);

        rc1.setCommand(garageDoorCloseCommand1);
        rc1.buttonWasPressed();
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");

    }

}
