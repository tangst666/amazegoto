// Copyright 2018 The Feed Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.libraries.feed.testing.host.stream;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.feed.host.stream.CardConfiguration;

/** Created by danrand on 7/25/18. */
public class FakeCardConfiguration implements CardConfiguration {

  @Override
  public int getDefaultCornerRadius() {
    return 0;
  }

  @Override
  public Drawable getCardBackground() {
    return new ColorDrawable(Color.RED);
  }

  @Override
  public int getCardBottomMargin() {
    return 1;
  }

  @Override
  public int getCardStartMargin() {
    return 2;
  }

  @Override
  public int getCardEndMargin() {
    return 3;
  }
}
