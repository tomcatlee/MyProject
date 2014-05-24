package com.tom.solr;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;

public class SolrJTest {

	public static void main(String[] args) {
		index();
	}

	/**
	 * 
	 */
	private static void index() {
		SolrServer server = new HttpSolrServer("http://localhost:8080/solr/");
		SolrInputDocument doc1 = new SolrInputDocument();
		doc1.addField("id", "id2", 1.0f);
		doc1.addField("name", "doc2", 1.0f);
		doc1.addField("price", 9998);
		try {
			server.add(doc1);
			server.commit();
		} catch (SolrServerException | IOException e) {
			e.printStackTrace();
		}

	}
}
