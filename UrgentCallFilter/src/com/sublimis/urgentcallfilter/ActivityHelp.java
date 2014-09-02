/*
    Copyright 2013-2014. Sublimis

    This file is part of Urgent Call Filter app for Android.

    Urgent Call Filter is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    The software is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this software. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sublimis.urgentcallfilter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityHelp extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		setContentView(R.layout.help_screen);
		
		WebView webView = (WebView) findViewById(R.id.webView);
		
		webView.setBackgroundColor(getResources().getColor(R.color.my_bg_color));
		webView.loadUrl("file:///android_asset/help/help.html");
	}
}