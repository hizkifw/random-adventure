package com.hizkifw.randventure;

public class Story {
	public boolean hasItems;
	public boolean hasEnemies;
	public boolean hasSavePoint;
	
	public boolean canGoNorth;
	public boolean canGoSouth;
	public boolean canGoEast;
	public boolean canGoWest;
	
	public Narration narration;
	
	public static enum StoryType {
		INTRODUCTION,
		FILLER,
		MINOR_CONFLICT,
		MAJOR_CONFLICT
	}
	public static enum Choices {
		GO_NORTH,
		GO_SOUTH,
		GO_EAST,
		GO_WEST,
		TAKE_ITEM,
		USE_ITEM,
		DISCARD_ITEM
		
	}
	
	public Story(StoryType type) {
		
	}
}
