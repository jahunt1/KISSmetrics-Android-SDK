//
// KISSmetricsSDK
//
// Copyright 2014 KISSmetrics
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.kissmetrics.sdk;


/**
 * SendingRunnable non-sending state
 * 
 * Provides Runnable objects for sending identities, events and properties to KISSmetrics for 
 * non-sending state.
 * Returned Runnables are intended to be run in an ExecutorService thread. 
 *
 */
public class SendingRunnablesNonSendingState implements SendingRunnables {
	
	
	/**
	 * Creates a Runnable for a recursive send for a non-sending state.
	 * 
	 * @param archiver  The instance of Archiver to use. 
	 * @param connection  The instance of Connection to use
	 * @param connectionDelegate  The instance of the ConnectionDelegate to receive the connection's 
	 * 		  completion callback.
	 * @return A no action Runnable.
	 */
	public Runnable runnableRecursiveSend(final Archiver archiver, final Connection connection, 
			  							  final ConnectionDelegate connectionDelegate) {

			Runnable runnable = new Runnable() { 
				public void run() {
					// No action taken
				}
			};
	
			return runnable;
	
	}
}
