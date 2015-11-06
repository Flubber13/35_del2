package test;


import org.junit.Assert;
import org.junit.Before;

import game.Player;

public class TestBalance {

	private Player player;

	@Before
	public void setUp() throws Exception {
		player = new Player(1000);
		player.getAccount().addBalance(-2000);		
	}

	@org.junit.Test
	public void test() {
		Assert.assertEquals(0, player.getAccount().getBalance());
	}

}
