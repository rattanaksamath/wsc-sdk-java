 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class CreateOutputForTranscoder {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //wsc-access-key.setApiKeyPrefix("Token");

        // Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	Output newOutput = new Output();
        newOutput.setStreamFormat(Output.StreamFormatEnum.AUDIOVIDEO);
        newOutput.setAspectRatioHeight(240);
        newOutput.setAspectRatioWidth(480);
        newOutput.setBitrateAudio(192);
        newOutput.setBitrateVideo(2400);
        newOutput.setH264Profile(Output.H264ProfileEnum.BASELINE);
        newOutput.setKeyframes(Output.KeyframesEnum.FOLLOW_SOURCE);
        newOutput.setPassthroughAudio(true);
        newOutput.setPassthroughVideo(false);

	try {
		Output result = apiInstance.createTranscoderOutput(transcoderId,newOutput);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#createTranscoderOutput");
	    e.printStackTrace();
		}

    }

}
