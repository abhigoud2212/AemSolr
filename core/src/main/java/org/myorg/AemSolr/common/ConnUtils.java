package org.myorg.AemSolr.common;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

public class ConnUtils {
	private ConnUtils() {

	}

	public void ConnectToSolr(String urlString) {
		// add core name at the end.
		SolrClient solr = new HttpSolrClient.Builder(urlString).build();
		// String zkHostString =
		// "zkServerA:2181,zkServerB:2181,zkServerC:2181/solr";
		// SolrClient solr1 = new
		// CloudSolrClient.Builder().withZkHost(zkHostString).build();

	}
}
