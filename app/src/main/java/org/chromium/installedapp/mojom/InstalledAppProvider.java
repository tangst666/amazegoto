
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/platform/modules/installedapp/installed_app_provider.mojom
//

package org.chromium.installedapp.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface InstalledAppProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends InstalledAppProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<InstalledAppProvider, InstalledAppProvider.Proxy> MANAGER = InstalledAppProvider_Internal.MANAGER;


    void filterInstalledApps(
RelatedApplication[] relatedApps, 
FilterInstalledAppsResponse callback);

    interface FilterInstalledAppsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<RelatedApplication[]> { }


}
