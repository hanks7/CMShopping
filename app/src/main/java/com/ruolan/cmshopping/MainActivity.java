package com.ruolan.cmshopping;

import com.ruolan.cainiao_core.activities.ProxyActivity;
import com.ruolan.cainiao_core.delegate.CainiaoDelegate;

public class MainActivity extends ProxyActivity {

    @Override
    public CainiaoDelegate setRootDelegate() {
        return new ExampleDelegate();
    }


}
