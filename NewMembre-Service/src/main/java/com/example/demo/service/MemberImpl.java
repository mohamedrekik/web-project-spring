package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Service;

import com.example.demo.EvenementBean;

import com.example.demo.OutilBean;
import com.example.demo.PublicationBean;
import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MemberRepository;
import com.example.demo.dao.Membreeventrepository;

import com.example.demo.dao.Membreoutrepository;
import com.example.demo.dao.Membrepubrepository;
import com.example.demo.dao.Publicationmbrrepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Membre_Evenement;
import com.example.demo.entities.Membre_Event_Ids;
import com.example.demo.entities.Membre_Out_Ids;
import com.example.demo.entities.Membre_Outil;

import com.example.demo.entities.Membre_Pub_Ids;
import com.example.demo.entities.Membre_Publication;

import com.example.demo.proxies.EvenementProxy;

import com.example.demo.proxies.OutilProxy;
import com.example.demo.proxies.PublicationProxy;

@Service
public class MemberImpl implements IMemberService {

	@Autowired
	MemberRepository memberRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EnseignantChercheurRepository enseignantChercheurRepository;
	@Autowired
	Membrepubrepository membrepubrepository;
	@Autowired
	Membreoutrepository membreoutrepository;
	@Autowired
	Membreeventrepository membreeventrepository;
	@Autowired
	Publicationmbrrepository publicationmbrrepository;

	@Autowired
	PublicationProxy proxypub;
	@Autowired
	OutilProxy proxyoutil;
	@Autowired
	EvenementProxy proxyevent;
	

	
	@Autowired
	IMemberService iMemberService;
	
	
	public Membre addMember(Membre m) {
		memberRepository.save(m);
		return m;
	}

	
	public void deleteMember(Long id) {
		
		memberRepository.deleteById(id);

	}
	public Membre updateMember(Membre m) {
		
		return memberRepository.saveAndFlush(m);
	}
	public Membre findMember(Long id) {
	Membre m= (Membre)memberRepository.findById(id).get();
		return m;
	}
	public List<Membre> findAll() {
		
		return memberRepository.findAll();
	}
	public List<Etudiant> findAllEtudiants(){
		return etudiantRepository.findAll();
	}
	

	public Membre findByCin(String cin) {
		return memberRepository.findByCin(cin);
	}
	public Membre findByEmail(String email) {
		return memberRepository.findByEmail(email);
	}
	public List<Membre> findByNom(String nom) {
		return memberRepository.findByNom(nom);
	}
	public List<Etudiant> findByDiplome(String diplome) {
		return etudiantRepository.findByDiplome(diplome);
	}
	public List<EnseignantChercheur> findByGrade(String grade) {
		
		return enseignantChercheurRepository.findByGrade(grade);
	}
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
	
		return enseignantChercheurRepository.findByEtablissement(etablissement);
	}
	
	public Etudiant findEtudiant(Long id){
		Etudiant et= (Etudiant)etudiantRepository.findById(id).get();
		return et;
	}
	public EnseignantChercheur findEnseignant(Long id) {
		EnseignantChercheur ens=(EnseignantChercheur)enseignantChercheurRepository.findById(id).get();
		return ens;
	}
	
	
	public List<EnseignantChercheur> findAllEnseignants() {
		return enseignantChercheurRepository.findAll();
	}


	@Override
	public Etudiant affecterencadrantToetudiant(Long idetd, Long idens) {
		// TODO Auto-generated method stub
		Etudiant etd= etudiantRepository.findById(idetd).get();
		EnseignantChercheur ens= enseignantChercheurRepository.findById(idens).get();
		etd.setEncadrant(ens);

		return etudiantRepository.save(etd);
	}


	@Override
	public void affecterauteurTopublication(Long idauteur, Long idpub) {
		Membre mbr= memberRepository.findById(idauteur).get();
		Membre_Publication mbs= new Membre_Publication();
		mbs.setAuteur(mbr);
		mbs.setId(new Membre_Pub_Ids(idpub, idauteur));
		membrepubrepository.save(mbs);
	}

	/// other ..

	@Override
	public List<PublicationBean> findPublicationparauteur(Long idauteur) {
		List<PublicationBean> pubs=new ArrayList<PublicationBean>();
	
		List< Membre_Publication> idpubs=membrepubrepository.findpubId(idauteur);
		
		idpubs.forEach(s->{
			System.out.println(s);
			pubs.add(proxypub.recupererUnePublication(s.getId().getPublication_id()).getContent());
			
		}
		);
		
		return pubs;
	}
	

	@Override
	public ArrayList<Membre> findAuteurparpublication(Long idpublication) {
		ArrayList<Membre> mbrs=new ArrayList<Membre>();
	
		List< Membre_Publication> idmbrs=publicationmbrrepository.findmbrId(idpublication);
		
		idmbrs.forEach(s->{
			System.out.println(s);
			mbrs.add(iMemberService.findMember(s.getId().getAuteur_id()));
			
		}
		);
		
		return mbrs;
	}
	
	/*///@Override
	public List<MemberBean> findAuteurparpublication(Long idpub) {
		List<MemberBean> mbrs=new ArrayList<MemberBean>();
	
		List< Membre_Publication> idmbrs=publicationmbrrepository.findmbrId(idpub);
		
		idmbrs.forEach(s->{
			System.out.println(s);
			mbrs.add(proxymbr.recupererUnMembre(s.getId().getAuteur_id()).getContent());
			
		}
		);
		
		return mbrs;
	}*/

	@Override
	public void affecterauteurTooutil(Long idauteur, Long idoutil){
		Membre mbr2= memberRepository.findById(idauteur).get();
		Membre_Outil mbs2= new Membre_Outil();
		mbs2.setAuteur(mbr2);
		mbs2.setId(new Membre_Out_Ids(idoutil, idauteur));
		membreoutrepository.save(mbs2);
	}


	@Override
	public List<OutilBean> findOutilparauteur(Long idauteur) {
		List<OutilBean> outils=new ArrayList<OutilBean>();
	
		List< Membre_Outil> idoutils=membreoutrepository.findoutId(idauteur);
		
		idoutils.forEach(s->{
			System.out.println(s);
			outils.add(proxyoutil.recupererUnOutil(s.getId().getOut_id()).getContent());
			
		}
		);
		
		return outils;
	}
	
	
	
	@Override
	public void affecterorganisateurToevenement(Long idorganisateur, Long idevent) {
		Membre mbr= memberRepository.findById(idorganisateur).get();
		Membre_Evenement mbs= new Membre_Evenement();
		mbs.setOrganisateur(mbr);
		mbs.setId(new Membre_Event_Ids(idevent, idorganisateur));
		membreeventrepository.save(mbs);
	}


	@Override
	public List<EvenementBean> findEvenementparorganisateur(Long idorganisateur) {
		List<EvenementBean> events=new ArrayList<EvenementBean>();
	
		List< Membre_Evenement> idevent=membreeventrepository.findeventId(idorganisateur);
		
		idevent.forEach(s->{
			System.out.println(s);
			events.add(proxyevent.recupererUnEvenement(s.getId().getEvent_id()).getContent());
			
		}
		);
		
		return events;
	}
}
