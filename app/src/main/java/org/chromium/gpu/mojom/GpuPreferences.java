
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/gpu_preferences.mojom
//

package org.chromium.gpu.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class GpuPreferences extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean singleProcess;
    public boolean inProcessGpu;
    public boolean disableAcceleratedVideoDecode;
    public boolean disableAcceleratedVideoEncode;
    public boolean gpuStartupDialog;
    public boolean disableGpuWatchdog;
    public boolean gpuSandboxStartEarly;
    public int enableAcceleratedVpxDecode;
    public boolean enableLowLatencyDxva;
    public boolean enableZeroCopyDxgiVideo;
    public boolean enableNv12DxgiVideo;
    public boolean enableMediaFoundationVeaOnWindows7;
    public boolean disableSoftwareRasterizer;
    public boolean logGpuControlListDecisions;
    public boolean compileShaderAlwaysSucceeds;
    public boolean disableGlErrorLimit;
    public boolean disableGlslTranslator;
    public boolean disableShaderNameHashing;
    public boolean enableGpuCommandLogging;
    public boolean enableGpuDebugging;
    public boolean enableGpuServiceLoggingGpu;
    public boolean enableGpuDriverDebugLogging;
    public boolean disableGpuProgramCache;
    public boolean enforceGlMinimums;
    public int forceGpuMemAvailable;
    public int gpuProgramCacheSize;
    public boolean disableGpuShaderDiskCache;
    public boolean enableThreadedTextureMailboxes;
    public boolean glShaderIntermOutput;
    public boolean emulateShaderPrecision;
    public int maxActiveWebglContexts;
    public boolean enableAndroidSurfaceControl;
    public boolean enableGpuServiceLogging;
    public boolean enableGpuServiceTracing;
    public boolean usePassthroughCmdDecoder;
    public boolean disableBiplanarGpuMemoryBuffersForVideoFrames;
    public org.chromium.gfx.mojom.BufferUsageAndFormat[] textureTargetExceptionList;
    public boolean disableGpuDriverBugWorkarounds;
    public boolean ignoreGpuBlacklist;
    public boolean enableOopRasterization;
    public boolean disableOopRasterization;
    public boolean enableOopRasterizationDdl;
    public boolean enableRasterToSkImage;
    public boolean watchdogStartsBackgrounded;
    public boolean enableVulkan;
    public boolean enableGpuBenchmarkingExtension;
    public boolean enableWebgpu;

    private GpuPreferences(int version) {
        super(STRUCT_SIZE, version);
    }

    public GpuPreferences() {
        this(0);
    }

    public static GpuPreferences deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static GpuPreferences deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static GpuPreferences decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        GpuPreferences result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new GpuPreferences(elementsOrVersion);
                {
                    
                result.singleProcess = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.inProcessGpu = decoder0.readBoolean(8, 1);
                }
                {
                    
                result.disableAcceleratedVideoDecode = decoder0.readBoolean(8, 2);
                }
                {
                    
                result.disableAcceleratedVideoEncode = decoder0.readBoolean(8, 3);
                }
                {
                    
                result.gpuStartupDialog = decoder0.readBoolean(8, 4);
                }
                {
                    
                result.disableGpuWatchdog = decoder0.readBoolean(8, 5);
                }
                {
                    
                result.gpuSandboxStartEarly = decoder0.readBoolean(8, 6);
                }
                {
                    
                result.enableLowLatencyDxva = decoder0.readBoolean(8, 7);
                }
                {
                    
                result.enableZeroCopyDxgiVideo = decoder0.readBoolean(9, 0);
                }
                {
                    
                result.enableNv12DxgiVideo = decoder0.readBoolean(9, 1);
                }
                {
                    
                result.enableMediaFoundationVeaOnWindows7 = decoder0.readBoolean(9, 2);
                }
                {
                    
                result.disableSoftwareRasterizer = decoder0.readBoolean(9, 3);
                }
                {
                    
                result.logGpuControlListDecisions = decoder0.readBoolean(9, 4);
                }
                {
                    
                result.compileShaderAlwaysSucceeds = decoder0.readBoolean(9, 5);
                }
                {
                    
                result.disableGlErrorLimit = decoder0.readBoolean(9, 6);
                }
                {
                    
                result.disableGlslTranslator = decoder0.readBoolean(9, 7);
                }
                {
                    
                result.disableShaderNameHashing = decoder0.readBoolean(10, 0);
                }
                {
                    
                result.enableGpuCommandLogging = decoder0.readBoolean(10, 1);
                }
                {
                    
                result.enableGpuDebugging = decoder0.readBoolean(10, 2);
                }
                {
                    
                result.enableGpuServiceLoggingGpu = decoder0.readBoolean(10, 3);
                }
                {
                    
                result.enableGpuDriverDebugLogging = decoder0.readBoolean(10, 4);
                }
                {
                    
                result.disableGpuProgramCache = decoder0.readBoolean(10, 5);
                }
                {
                    
                result.enforceGlMinimums = decoder0.readBoolean(10, 6);
                }
                {
                    
                result.disableGpuShaderDiskCache = decoder0.readBoolean(10, 7);
                }
                {
                    
                result.enableThreadedTextureMailboxes = decoder0.readBoolean(11, 0);
                }
                {
                    
                result.glShaderIntermOutput = decoder0.readBoolean(11, 1);
                }
                {
                    
                result.emulateShaderPrecision = decoder0.readBoolean(11, 2);
                }
                {
                    
                result.enableAndroidSurfaceControl = decoder0.readBoolean(11, 3);
                }
                {
                    
                result.enableGpuServiceLogging = decoder0.readBoolean(11, 4);
                }
                {
                    
                result.enableGpuServiceTracing = decoder0.readBoolean(11, 5);
                }
                {
                    
                result.usePassthroughCmdDecoder = decoder0.readBoolean(11, 6);
                }
                {
                    
                result.disableBiplanarGpuMemoryBuffersForVideoFrames = decoder0.readBoolean(11, 7);
                }
                {
                    
                result.enableAcceleratedVpxDecode = decoder0.readInt(12);
                    VpxDecodeVendors.validate(result.enableAcceleratedVpxDecode);
                }
                {
                    
                result.forceGpuMemAvailable = decoder0.readInt(16);
                }
                {
                    
                result.gpuProgramCacheSize = decoder0.readInt(20);
                }
                {
                    
                result.maxActiveWebglContexts = decoder0.readInt(24);
                }
                {
                    
                result.disableGpuDriverBugWorkarounds = decoder0.readBoolean(28, 0);
                }
                {
                    
                result.ignoreGpuBlacklist = decoder0.readBoolean(28, 1);
                }
                {
                    
                result.enableOopRasterization = decoder0.readBoolean(28, 2);
                }
                {
                    
                result.disableOopRasterization = decoder0.readBoolean(28, 3);
                }
                {
                    
                result.enableOopRasterizationDdl = decoder0.readBoolean(28, 4);
                }
                {
                    
                result.enableRasterToSkImage = decoder0.readBoolean(28, 5);
                }
                {
                    
                result.watchdogStartsBackgrounded = decoder0.readBoolean(28, 6);
                }
                {
                    
                result.enableVulkan = decoder0.readBoolean(28, 7);
                }
                {
                    
                result.enableGpuBenchmarkingExtension = decoder0.readBoolean(29, 0);
                }
                {
                    
                result.enableWebgpu = decoder0.readBoolean(29, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.textureTargetExceptionList = new org.chromium.gfx.mojom.BufferUsageAndFormat[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.textureTargetExceptionList[i1] = org.chromium.gfx.mojom.BufferUsageAndFormat.decode(decoder2);
                    }
                }
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.singleProcess, 8, 0);
        
        encoder0.encode(this.inProcessGpu, 8, 1);
        
        encoder0.encode(this.disableAcceleratedVideoDecode, 8, 2);
        
        encoder0.encode(this.disableAcceleratedVideoEncode, 8, 3);
        
        encoder0.encode(this.gpuStartupDialog, 8, 4);
        
        encoder0.encode(this.disableGpuWatchdog, 8, 5);
        
        encoder0.encode(this.gpuSandboxStartEarly, 8, 6);
        
        encoder0.encode(this.enableLowLatencyDxva, 8, 7);
        
        encoder0.encode(this.enableZeroCopyDxgiVideo, 9, 0);
        
        encoder0.encode(this.enableNv12DxgiVideo, 9, 1);
        
        encoder0.encode(this.enableMediaFoundationVeaOnWindows7, 9, 2);
        
        encoder0.encode(this.disableSoftwareRasterizer, 9, 3);
        
        encoder0.encode(this.logGpuControlListDecisions, 9, 4);
        
        encoder0.encode(this.compileShaderAlwaysSucceeds, 9, 5);
        
        encoder0.encode(this.disableGlErrorLimit, 9, 6);
        
        encoder0.encode(this.disableGlslTranslator, 9, 7);
        
        encoder0.encode(this.disableShaderNameHashing, 10, 0);
        
        encoder0.encode(this.enableGpuCommandLogging, 10, 1);
        
        encoder0.encode(this.enableGpuDebugging, 10, 2);
        
        encoder0.encode(this.enableGpuServiceLoggingGpu, 10, 3);
        
        encoder0.encode(this.enableGpuDriverDebugLogging, 10, 4);
        
        encoder0.encode(this.disableGpuProgramCache, 10, 5);
        
        encoder0.encode(this.enforceGlMinimums, 10, 6);
        
        encoder0.encode(this.disableGpuShaderDiskCache, 10, 7);
        
        encoder0.encode(this.enableThreadedTextureMailboxes, 11, 0);
        
        encoder0.encode(this.glShaderIntermOutput, 11, 1);
        
        encoder0.encode(this.emulateShaderPrecision, 11, 2);
        
        encoder0.encode(this.enableAndroidSurfaceControl, 11, 3);
        
        encoder0.encode(this.enableGpuServiceLogging, 11, 4);
        
        encoder0.encode(this.enableGpuServiceTracing, 11, 5);
        
        encoder0.encode(this.usePassthroughCmdDecoder, 11, 6);
        
        encoder0.encode(this.disableBiplanarGpuMemoryBuffersForVideoFrames, 11, 7);
        
        encoder0.encode(this.enableAcceleratedVpxDecode, 12);
        
        encoder0.encode(this.forceGpuMemAvailable, 16);
        
        encoder0.encode(this.gpuProgramCacheSize, 20);
        
        encoder0.encode(this.maxActiveWebglContexts, 24);
        
        encoder0.encode(this.disableGpuDriverBugWorkarounds, 28, 0);
        
        encoder0.encode(this.ignoreGpuBlacklist, 28, 1);
        
        encoder0.encode(this.enableOopRasterization, 28, 2);
        
        encoder0.encode(this.disableOopRasterization, 28, 3);
        
        encoder0.encode(this.enableOopRasterizationDdl, 28, 4);
        
        encoder0.encode(this.enableRasterToSkImage, 28, 5);
        
        encoder0.encode(this.watchdogStartsBackgrounded, 28, 6);
        
        encoder0.encode(this.enableVulkan, 28, 7);
        
        encoder0.encode(this.enableGpuBenchmarkingExtension, 29, 0);
        
        encoder0.encode(this.enableWebgpu, 29, 1);
        
        if (this.textureTargetExceptionList == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.textureTargetExceptionList.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.textureTargetExceptionList.length; ++i0) {
                
                encoder1.encode(this.textureTargetExceptionList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}