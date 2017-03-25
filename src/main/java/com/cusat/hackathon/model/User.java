package com.cusat.hackathon.model;

import java.util.Set;

public class User {
		private PersonalDetail personalDetail;
		private PermanentAddress permanentAddress;
		private CorrespondenceAddress correspondenceAddress;
		private Cirtification cirtification;
		private Set<EduDetail> eduDetail;
		private FieldOfInterest fieldOfInterest;
		private Result result;
		
		
		/**
		 * @return the cirtification
		 */
		public Cirtification getCirtification() {
			return cirtification;
		}
		/**
		 * @param cirtification the cirtification to set
		 */
		public void setCirtification(Cirtification cirtification) {
			this.cirtification = cirtification;
		}
		
		
		public Set<EduDetail> getEduDetail() {
			return eduDetail;
		}
		public void setEduDetail(Set<EduDetail> eduDetail) {
			this.eduDetail = eduDetail;
		}
		/**
		 * @return the fieldOfInterest
		 */
		public FieldOfInterest getFieldOfInterest() {
			return fieldOfInterest;
		}
		/**
		 * @param fieldOfInterest the fieldOfInterest to set
		 */
		public void setFieldOfInterest(FieldOfInterest fieldOfInterest) {
			this.fieldOfInterest = fieldOfInterest;
		}
		/**
		 * @return the result
		 */
		public Result getResult() {
			return result;
		}
		/**
		 * @param result the result to set
		 */
		public void setResult(Result result) {
			this.result = result;
		}
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
