package com.structural.facade.hotel.kepper;

import com.structural.facade.hotel.menu.Menu;

public interface Keeper {
	Menu getVegMenu();
	Menu getNonVegMenu();
	Menu getBothMenu();
}
