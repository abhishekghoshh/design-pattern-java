package com.structural.facade;

import com.structural.facade.hotel.kepper.HotelKeeper;
import com.structural.facade.hotel.menu.BothMenu;
import com.structural.facade.hotel.menu.NonVegMenu;
import com.structural.facade.hotel.menu.VegMenu;
import com.structural.facade.theater.Amplifier;
import com.structural.facade.theater.CdPlayer;
import com.structural.facade.theater.DvdPlayer;
import com.structural.facade.theater.HomeTheaterFacade;
import com.structural.facade.theater.PopcornPopper;
import com.structural.facade.theater.Projector;
import com.structural.facade.theater.Screen;
import com.structural.facade.theater.TheaterLights;
import com.structural.facade.theater.Tuner;

public class Client {
	public static void main(String arg[]) {
		HotelKeeper keeper = new HotelKeeper();

        VegMenu vegMenu = keeper.getVegMenu();
        vegMenu.showMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        nonVegMenu.showMenu();
        BothMenu bothMenu = keeper.getBothMenu();
        bothMenu.showMenu();
        
        
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd,
                                                                projector, screen, lights, popper);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
	}
}
