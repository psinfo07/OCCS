package com.cusat.hackathon.dao;

import java.util.ArrayList;
import java.util.List;

import com.cusat.hackathon.model.Question;

public class QuestionDao {
			public List<Question> getQuestionById(){
				List<Question> questions= new ArrayList<Question>();	
				int i=0;
				while(i>1){
					Question question= new Question();
					question.setQuestion("");
					questions.add(question);
				}
				
				return questions;
				
			}
}
