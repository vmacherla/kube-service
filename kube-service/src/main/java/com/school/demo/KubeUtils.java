package com.school.demo;

import java.io.IOException;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.util.ClientBuilder;

public class KubeUtils {

	public void kubeclient() {
		try {
			final ApiClient client = ClientBuilder.cluster().build();
			Configuration.setDefaultApiClient(client);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}
}
