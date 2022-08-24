package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IInvestigatorDAO;
import com.crud.h2.dto.Investigator;

@Service
public class InvestigatorServiceImpl implements IInvestigatorService{
		//We use the methods of the IItemDAO interface, it is as if we were instantiating.
		@Autowired
		IInvestigatorDAO iInvestigatorDAO;
		
		@Override
		public List<Investigator> listInvestigators() {
			
			return iInvestigatorDAO.findAll();
		}

		@Override
		public Investigator saveInvestigator(Investigator investigator) {
			return iInvestigatorDAO.save(investigator);
		}

		@Override
		public Investigator investigatorXID(Long id) {
			return iInvestigatorDAO.findById(id).get();
		}

		@Override
		public Investigator updateInvestigator(Investigator investigator) {
			return iInvestigatorDAO.save(investigator);
		}

		@Override
		public void deleteInvestigator(Long id) {
			iInvestigatorDAO.deleteById(id);		
		}
}
