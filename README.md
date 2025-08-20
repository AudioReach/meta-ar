# meta-ar


This is a temporary repository for hosting the OpenEmbedded meta-layer for AudioReach on Qualcomm platforms.

Install kas latest version with pip.

->sudo apt-get remove kas

->pip install kas

In the working directory, clone the following repositories:

->git clone https://github.com/Audioreach/meta-ar.git

In working directory run this command to set up your build environment and start compilation:

->kas shell meta-ar/ci/qcs6490-rb3gen2-core-kit.yml

for apply kernel patch

->cd ../meta-qcom

->git fetch git@github.com:qualcomm-linux/meta-qcom.git 78f13cf900b6df8176cbe722576aebbdf9a4d70d && git cherry-pick FETCH_HEAD

->cd ../build

->umask 022

->bitbake core-image-base

in above step replace yml file based on machines compilation required:

->Lemans: qcs9100-ride-sx.yml

->Monaco: qcs8300-ride-sx.yml

->Kodiak: qcs6490-rb3gen2-core-kit.yml


# License
meta-audioreach is licensed under the MIT License. Check out the [LICENSE](LICENSE) for more details
