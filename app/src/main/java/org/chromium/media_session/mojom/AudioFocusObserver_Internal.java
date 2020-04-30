
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/audio_focus.mojom
//

package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class AudioFocusObserver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AudioFocusObserver, AudioFocusObserver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AudioFocusObserver, AudioFocusObserver.Proxy>() {

        @Override
        public String getName() {
            return "media_session.mojom.AudioFocusObserver";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, AudioFocusObserver impl) {
            return new Stub(core, impl);
        }

        @Override
        public AudioFocusObserver[] buildArray(int size) {
          return new AudioFocusObserver[size];
        }
    };


    private static final int ON_FOCUS_GAINED_ORDINAL = 0;

    private static final int ON_FOCUS_LOST_ORDINAL = 1;

    private static final int ON_ACTIVE_SESSION_CHANGED_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AudioFocusObserver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onFocusGained(
MediaSessionInfo session, int type) {

            AudioFocusObserverOnFocusGainedParams _message = new AudioFocusObserverOnFocusGainedParams();

            _message.session = session;

            _message.type = type;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_FOCUS_GAINED_ORDINAL)));

        }


        @Override
        public void onFocusLost(
MediaSessionInfo session) {

            AudioFocusObserverOnFocusLostParams _message = new AudioFocusObserverOnFocusLostParams();

            _message.session = session;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_FOCUS_LOST_ORDINAL)));

        }


        @Override
        public void onActiveSessionChanged(
AudioFocusRequestState session) {

            AudioFocusObserverOnActiveSessionChangedParams _message = new AudioFocusObserverOnActiveSessionChangedParams();

            _message.session = session;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ACTIVE_SESSION_CHANGED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AudioFocusObserver> {

        Stub(org.chromium.mojo.system.Core core, AudioFocusObserver impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                AudioFocusObserver_Internal.MANAGER, messageWithHeader);





                    case ON_FOCUS_GAINED_ORDINAL: {

                        AudioFocusObserverOnFocusGainedParams data =
                                AudioFocusObserverOnFocusGainedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onFocusGained(data.session, data.type);
                        return true;
                    }





                    case ON_FOCUS_LOST_ORDINAL: {

                        AudioFocusObserverOnFocusLostParams data =
                                AudioFocusObserverOnFocusLostParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onFocusLost(data.session);
                        return true;
                    }





                    case ON_ACTIVE_SESSION_CHANGED_ORDINAL: {

                        AudioFocusObserverOnActiveSessionChangedParams data =
                                AudioFocusObserverOnActiveSessionChangedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onActiveSessionChanged(data.session);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), AudioFocusObserver_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class AudioFocusObserverOnFocusGainedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public MediaSessionInfo session;
        public int type;

        private AudioFocusObserverOnFocusGainedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioFocusObserverOnFocusGainedParams() {
            this(0);
        }

        public static AudioFocusObserverOnFocusGainedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioFocusObserverOnFocusGainedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioFocusObserverOnFocusGainedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioFocusObserverOnFocusGainedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioFocusObserverOnFocusGainedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.session = MediaSessionInfo.decode(decoder1);
                    }
                    {
                        
                    result.type = decoder0.readInt(16);
                        AudioFocusType.validate(result.type);
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
            
            encoder0.encode(this.session, 8, false);
            
            encoder0.encode(this.type, 16);
        }
    }



    
    static final class AudioFocusObserverOnFocusLostParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public MediaSessionInfo session;

        private AudioFocusObserverOnFocusLostParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioFocusObserverOnFocusLostParams() {
            this(0);
        }

        public static AudioFocusObserverOnFocusLostParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioFocusObserverOnFocusLostParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioFocusObserverOnFocusLostParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioFocusObserverOnFocusLostParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioFocusObserverOnFocusLostParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.session = MediaSessionInfo.decode(decoder1);
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
            
            encoder0.encode(this.session, 8, false);
        }
    }



    
    static final class AudioFocusObserverOnActiveSessionChangedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public AudioFocusRequestState session;

        private AudioFocusObserverOnActiveSessionChangedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioFocusObserverOnActiveSessionChangedParams() {
            this(0);
        }

        public static AudioFocusObserverOnActiveSessionChangedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioFocusObserverOnActiveSessionChangedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioFocusObserverOnActiveSessionChangedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioFocusObserverOnActiveSessionChangedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioFocusObserverOnActiveSessionChangedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.session = AudioFocusRequestState.decode(decoder1);
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
            
            encoder0.encode(this.session, 8, true);
        }
    }



}
