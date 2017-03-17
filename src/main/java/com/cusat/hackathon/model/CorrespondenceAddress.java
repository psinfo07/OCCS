package com.cusat.hackathon.model;

public class CorrespondenceAddress {
		
		private String userId;
		private String addressLine1;
		private String addressLine2;
		private String city;
		private String dist;
		private String state;
		private String pin;
		
		public String getUserId() {
			return userId;
		}
		/**
		 * @param userId the userId to set
		 */
		public void setUserId(String userId) {
			this.userId = userId;
		}
		/**
		 * @return the addressLine1
		 */
		public String getAddressLine1() {
			return addressLine1;
		}
		/**
		 * @param addressLine1 the addressLine1 to set
		 */
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		/**
		 * @return the addressLine2
		 */
		public String getAddressLine2() {
			return addressLine2;
		}
		/**
		 * @param addressLine2 the addressLine2 to set
		 */
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @return the dist
		 */
		public String getDist() {
			return dist;
		}
		/**
		 * @param dist the dist to set
		 */
		public void setDist(String dist) {
			this.dist = dist;
		}
		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}
		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}
		/**
		 * @return the pin
		 */
		public String getPin() {
			return pin;
		}
		/**
		 * @param pin the pin to set
		 */
		public void setPin(String pin) {
			this.pin = pin;
		}

}
