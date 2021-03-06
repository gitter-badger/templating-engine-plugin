/*
   Copyright 2018 Booz Allen Hamilton

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.boozallen.plugins.jte.config

import java.io.IOException

import org.kohsuke.stapler.DataBoundConstructor
import org.kohsuke.stapler.DataBoundSetter
import hudson.scm.SCM
import hudson.Extension
import hudson.model.Queue
import hudson.model.Run
import hudson.model.TaskListener
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.Whitelisted 
import hudson.model.AbstractDescribableImpl
import hudson.model.Descriptor

public class TemplateLibrarySource extends AbstractDescribableImpl<TemplateLibrarySource> implements Serializable{

    public SCM scm 

    @DataBoundConstructor public TemplateLibrarySource(){}

    @DataBoundSetter public void setScm(SCM scm){ this.scm = scm }
    public SCM getScm(){ return scm }

    @Extension public static class DescriptorImpl extends Descriptor<TemplateLibrarySource> {

    }

}