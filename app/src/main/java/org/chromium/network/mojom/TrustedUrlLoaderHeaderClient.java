
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface TrustedUrlLoaderHeaderClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends TrustedUrlLoaderHeaderClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<TrustedUrlLoaderHeaderClient, TrustedUrlLoaderHeaderClient.Proxy> MANAGER = TrustedUrlLoaderHeaderClient_Internal.MANAGER;


    void onBeforeSendHeaders(
int requestId, HttpRequestHeaders headers, 
OnBeforeSendHeadersResponse callback);

    interface OnBeforeSendHeadersResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, HttpRequestHeaders> { }



    void onHeadersReceived(
int requestId, String headers, 
OnHeadersReceivedResponse callback);

    interface OnHeadersReceivedResponse extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, String, org.chromium.url.mojom.Url> { }


}
