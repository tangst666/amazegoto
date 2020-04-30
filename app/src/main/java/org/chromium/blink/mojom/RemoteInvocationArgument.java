
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/web/remote_objects.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class RemoteInvocationArgument extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int NumberValue = 0;
        public static final int BooleanValue = 1;
        public static final int StringValue = 2;
        public static final int SingletonValue = 3;
        public static final int ArrayValue = 4;
    };
    private double mNumberValue;
    private boolean mBooleanValue;
    private org.chromium.mojo_base.mojom.String16 mStringValue;
    private int mSingletonValue;
    private RemoteInvocationArgument[] mArrayValue;

    public void setNumberValue(double numberValue) {
        this.mTag = Tag.NumberValue;
        this.mNumberValue = numberValue;
    }

    public double getNumberValue() {
        assert this.mTag == Tag.NumberValue;
        return this.mNumberValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.mTag = Tag.BooleanValue;
        this.mBooleanValue = booleanValue;
    }

    public boolean getBooleanValue() {
        assert this.mTag == Tag.BooleanValue;
        return this.mBooleanValue;
    }

    public void setStringValue(org.chromium.mojo_base.mojom.String16 stringValue) {
        this.mTag = Tag.StringValue;
        this.mStringValue = stringValue;
    }

    public org.chromium.mojo_base.mojom.String16 getStringValue() {
        assert this.mTag == Tag.StringValue;
        return this.mStringValue;
    }

    public void setSingletonValue(int singletonValue) {
        this.mTag = Tag.SingletonValue;
        this.mSingletonValue = singletonValue;
    }

    public int getSingletonValue() {
        assert this.mTag == Tag.SingletonValue;
        return this.mSingletonValue;
    }

    public void setArrayValue(RemoteInvocationArgument[] arrayValue) {
        this.mTag = Tag.ArrayValue;
        this.mArrayValue = arrayValue;
    }

    public RemoteInvocationArgument[] getArrayValue() {
        assert this.mTag == Tag.ArrayValue;
        return this.mArrayValue;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.NumberValue: {
                
                encoder0.encode(this.mNumberValue, offset + 8);
                break;
            }
            case Tag.BooleanValue: {
                
                encoder0.encode(this.mBooleanValue, offset + 8, 0);
                break;
            }
            case Tag.StringValue: {
                
                encoder0.encode(this.mStringValue, offset + 8, false);
                break;
            }
            case Tag.SingletonValue: {
                
                encoder0.encode(this.mSingletonValue, offset + 8);
                break;
            }
            case Tag.ArrayValue: {
                
                if (this.mArrayValue == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                } else {
                    org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodeUnionArray(this.mArrayValue.length, offset + 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i0 = 0; i0 < this.mArrayValue.length; ++i0) {
                        
                        encoder1.encode(this.mArrayValue[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                        org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i0, false);
                    }
                }
                break;
            }
            default: {
                break;
            }
        }
    }

    public static RemoteInvocationArgument deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final RemoteInvocationArgument decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        RemoteInvocationArgument result = new RemoteInvocationArgument();
        switch (dataHeader.elementsOrVersion) {
            case Tag.NumberValue: {
                
                result.mNumberValue = decoder0.readDouble(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                result.mTag = Tag.NumberValue;
                break;
            }
            case Tag.BooleanValue: {
                
                result.mBooleanValue = decoder0.readBoolean(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, 0);
                result.mTag = Tag.BooleanValue;
                break;
            }
            case Tag.StringValue: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mStringValue = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                result.mTag = Tag.StringValue;
                break;
            }
            case Tag.SingletonValue: {
                
                result.mSingletonValue = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    SingletonJavaScriptValue.validate(result.mSingletonValue);
                result.mTag = Tag.SingletonValue;
                break;
            }
            case Tag.ArrayValue: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.mArrayValue = new RemoteInvocationArgument[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.mArrayValue[i1] = RemoteInvocationArgument.decode(decoder1, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                        org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i1);
                    }
                }
                result.mTag = Tag.ArrayValue;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}