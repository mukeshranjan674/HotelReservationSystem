package com.capgemini.hotelreservationsystem;

public class Hotel {

	private String name;
	private int regularWeekdayRate;
	private int regularWeekendRate;
	private int rating;
	private int rewardsWeekdayRate;
	private int rewardsWeekendRate;

	/**
	 * UC1
	 * 
	 * @param name
	 * @param regularWeekdayRate
	 */
	public Hotel(String name, int regularWeekdayRate) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
	}

	/**
	 * UC3
	 * 
	 * @param name
	 * @param regularWeekdayRate
	 * @param regularWeekendRate
	 */
	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
	}

	/**
	 * UC5
	 * 
	 * @param name
	 * @param regularWeekdayRate
	 * @param regularWeekendRate
	 * @param rating
	 */
	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate, int rating) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
		this.rating = rating;
	}

	/**
	 * UC9
	 * 
	 * @param name
	 * @param regularWeekdayRate
	 * @param regularWeekendRate
	 * @param rating
	 * @param rewardsWeekdayRate
	 * @param rewardsWeekendRate
	 */
	public Hotel(String name, int regularWeekdayRate, int regularWeekendRate, int rating, int rewardsWeekdayRate,
			int rewardsWeekendRate) {
		this.name = name;
		this.regularWeekdayRate = regularWeekdayRate;
		this.regularWeekendRate = regularWeekendRate;
		this.rating = rating;
		this.rewardsWeekdayRate = rewardsWeekdayRate;
		this.rewardsWeekendRate = rewardsWeekendRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegularWeekdayRate() {
		return regularWeekdayRate;
	}

	public void setRegularWeekdayRate(int regularWeekdayRate) {
		this.regularWeekdayRate = regularWeekdayRate;
	}

	public int getRegularWeekendRate() {
		return regularWeekendRate;
	}

	public void setRegularWeekendRate(int regularWeekendRate) {
		this.regularWeekendRate = regularWeekendRate;
	}

	public int getRewardsWeekdayRate() {
		return rewardsWeekdayRate;
	}

	public void setRewardsWeekdayRate(int rewardsWeekdayRate) {
		this.rewardsWeekdayRate = rewardsWeekdayRate;
	}

	public int getRewardsWeekendRate() {
		return rewardsWeekendRate;
	}

	public void setRewardsWeekendRate(int rewardsWeekendRate) {
		this.rewardsWeekendRate = rewardsWeekendRate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
