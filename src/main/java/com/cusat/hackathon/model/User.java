package com.cusat.hackathon.model;

public class User {
		private PersonalDetail personalDetail;
		private PermanentAddress permanentAddress;
		private CorrespondenceAddress correspondenceAddress;
		
		public PersonalDetail getPersonalDetail() {
			return personalDetail;
		}
		/**
		 * @param personalDetail the personalDetail to set
		 */
		public void setPersonalDetail(PersonalDetail personalDetail) {
			this.personalDetail = personalDetail;
		}
		/**
		 * @return the permanentAddress
		 */
		public PermanentAddress getPermanentAddress() {
			return permanentAddress;
		}
		/**
		 * @param permanentAddress the permanentAddress to set
		 */
		public void setPermanentAddress(PermanentAddress permanentAddress) {
			this.permanentAddress = permanentAddress;
		}
		/**
		 * @return the correspondenceAddress
		 */
		public CorrespondenceAddress getCorrespondenceAddress() {
			return correspondenceAddress;
		}
		
		public void setCorrespondenceAddress(CorrespondenceAddress correspondenceAddress) {
			this.correspondenceAddress = correspondenceAddress;
		}
		
		
}
